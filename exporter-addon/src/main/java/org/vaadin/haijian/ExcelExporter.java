package org.vaadin.haijian;

import com.vaadin.v7.data.Container;
import com.vaadin.v7.ui.Table;
import org.vaadin.haijian.filegenerator.ExcelFileBuilder;
import org.vaadin.haijian.filegenerator.FileBuilder;

public class ExcelExporter extends Exporter {
    public ExcelExporter() {
        super();
    }

    public ExcelExporter(Table table) {
        super(table);
    }

    public ExcelExporter(Container container, Object[] visibleColumns) {
        super(container, visibleColumns);
    }

    public ExcelExporter(Container container) {
        super(container);
    }

    @Override
    protected FileBuilder createFileBuilder(Container container) {
        return new ExcelFileBuilder(container);
    }

    @Override
    protected String getDownloadFileName() {
    	if(downloadFileName == null){
    		return "exported-excel.xls";
        }
    	if(downloadFileName.endsWith(".xls")){
    		return downloadFileName;
    	}else{
    		return downloadFileName + ".xls";
    	}
    }
}
