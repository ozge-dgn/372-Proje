package org.proje.gui.tableModels;

import org.proje.jdbc.model.Ogrenci;
import org.proje.jdbc.model.PTurCalisan;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PTCTM extends AbstractTableModel {
    private static final int PERSONEL_ID=0;
    private static final int AD=1;
    private static final int SOYAD=2;
    private static final int P_TURU=3;
    private static final int C_TURU=4;
    private String[] col_names = {"Personel ID", "Ad", "Soyad","Personel Türü","Çalışan Türü"};
    private List<PTurCalisan> ptc;

    public PTCTM(List<PTurCalisan> ptc) {
        this.ptc = ptc;
    }

    @Override
    public int getRowCount() {
        return ptc.size();
    }

    @Override
    public int getColumnCount() {
        return col_names.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PTurCalisan p = ptc.get(rowIndex);
        switch (columnIndex){
            case PERSONEL_ID:
                return p.getPersonel_id();
            case AD:
                return p.getAd();
            case SOYAD:
                return p.getSoyad();
            case P_TURU:
                return p.getpTur();
            case C_TURU:
                return p.getcTur();
        }

        return null;
    }
    @Override
    public String getColumnName(int column) {
        return col_names[column];
    }
}