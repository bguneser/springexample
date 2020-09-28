package com.bguneser;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel (value = "My Pet Object",description = "my pet")
public class Pet {


    @ApiModelProperty(value = "Pet Object id property")
    private  int id;
    @ApiModelProperty(value = "Pet Object name property")
    private String name;
    @ApiModelProperty(value = "Pet Object Date property")
    private Date date;
}
