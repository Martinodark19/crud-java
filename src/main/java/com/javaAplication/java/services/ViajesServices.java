package com.javaAplication.java.services;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.javaAplication.java.dto.DataTripsSearchDto;
import com.javaAplication.java.models.BusesViajesInfoModel;

@Service
@Transactional

public class ViajesServices 
{

    private SessionFactory sessionFactory;

    @Autowired
    public ViajesServices(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public List<BusesViajesInfoModel> searchTripsServices(DataTripsSearchDto dataTripsSearchDto) 
    {
        // creamos una instancia para actualizar los setters
        BusesViajesInfoModel busesViajesInfoModel = new BusesViajesInfoModel();
        busesViajesInfoModel.setFecha_viaje(dataTripsSearchDto.getFecha_seleccionada());
        busesViajesInfoModel.setCiudad_inicio(dataTripsSearchDto.getCiudad_inicio());
        busesViajesInfoModel.setCiudad_destino(dataTripsSearchDto.getCiudad_de_destino());

        List <BusesViajesInfoModel> results = null;

        // se procede a crear una sesion para poder acceder a usar hibernate
        try(Session session = sessionFactory.openSession()) 
        {
            session.beginTransaction();

            String consultaHql = "FROM BusesViajesInfoModel b WHERE b.fecha_viaje = :fechaViaje and b.ciudad_inicio = :ciudadInicio and b.ciudad_destino = :ciudadDestino";
            Query<BusesViajesInfoModel> creadorConsulta = session.createQuery(consultaHql, BusesViajesInfoModel.class);
            creadorConsulta.setParameter("fechaViaje", busesViajesInfoModel.getFecha_viaje());
            creadorConsulta.setParameter("ciudadInicio", busesViajesInfoModel.getCiudad_inicio());
            creadorConsulta.setParameter("ciudadDestino", busesViajesInfoModel.getCiudad_destino());

            // confirmamos la transaccion
            session.getTransaction().commit();

            results = creadorConsulta.list();
        } 
        catch (HibernateException e) 
        {
            System.out.println(e.getMessage());
            throw e;
        }


        // retornamos nuestra lista en true o false y verificamos en el controlador
        return results;
    }
}
