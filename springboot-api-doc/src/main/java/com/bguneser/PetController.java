package com.bguneser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "My Pet Api Documentation")
public class PetController {

    List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){

        petList.add(new Pet(1,"Test Pet",new Date()));

    }

    @PostMapping
    @ApiOperation(value = "Save pet method", notes = "be careful when using this method")
    public  ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "mypet") Pet pet){

        petList.add(pet);

        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "Pet List", notes = "This method list all pets")
    public ResponseEntity<List<Pet>> ListUsers(){

        return ResponseEntity.ok(petList);
    }
}
