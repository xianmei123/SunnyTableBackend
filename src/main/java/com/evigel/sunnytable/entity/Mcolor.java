package com.evigel.sunnytable.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author evigel
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Mcolor对象", description="")
@AllArgsConstructor
public class Mcolor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long mid;

    private Integer no;

    private String color;


    public static final String MID = "mid";

    public static final String NO = "no";

    public static final String COLOR = "color";


}
