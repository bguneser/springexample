package com.bguneser.weblux.api;

import com.bguneser.dto.VehicleDto;
import com.bguneser.graphql.entity.Vehicle;
import com.bguneser.graphql.repo.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

   public Vehicle createVehicle(VehicleDto vehicleDto){

       return vehicleRepository.save(dtoToEntity(vehicleDto));

    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){

       Vehicle vehicle = new Vehicle();
       vehicle.setBrandName(vehicleDto.getBrandName());
       vehicle.setLaunchDate(new Date());
       vehicle.setModelCode(vehicleDto.getModelCode());
       vehicle.setType(vehicleDto.getType());
       return  vehicle;

    }
}
