package com.mook.excel.helper.annotation;

import org.apache.poi.ss.usermodel.CellType;

/**
 * 单元格属性，也就是列属性
 * 
 * @author w.dehai
 *
 */
public @interface Cell {

    /**
     * 列名
     */
    String name() default "";

    /**
     * 单元格列宽（默认：0，自适应宽度，大于0生效，小于等于0无效）
     */
    int width() default 0;

    /**
     * 单元格值的类型，参考：{@link CellType}
     */
    CellType cellType() default CellType.STRING;

}
