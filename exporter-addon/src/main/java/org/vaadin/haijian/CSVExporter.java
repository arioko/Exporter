package org.vaadin.haijian;

import com.vaadin.v7.data.Container;
import com.vaadin.v7.ui.Table;
import org.vaadin.haijian.filegenerator.CSVFileBuilder;
import org.vaadin.haijian.filegenerator.FileBuilder;

public class CSVExporter extends Exporter {
    public CSVExporter() {
        super();
    }

    public CSVExporter(Table table) {
        super(table);
    }

    public CSVExporter(Container container, Object[] visibleColumns) {
        super(container, visibleColumns);
    }

    public CSVExporter(Container container) {
        super(container);
    }

    @Override
    protected FileBuilder createFileBuilder(Container container) {
        // TODO Auto-generated method stub
        return new CSVFileBuilder(container);
    }

    @Override
    protected String getDownloadFileName() {
    	if(downloadFileName == null){
    		return "exported-csv.csv";
        }
    	if(downloadFileName.endsWith(".csv")){
    		return downloadFileName;
    	}else{
    		return downloadFileName + ".csv";
    	}
    }

}
