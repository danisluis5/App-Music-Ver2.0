/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import bean.ThanhPho;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author PHUTRAN
 */
public class JListThanhPho implements ListModel<ThanhPho> {
    private ArrayList<ThanhPho> listTP;
    public JListThanhPho() {
        listTP = new ArrayList<>();
        listTP.add(new ThanhPho(1, "Đà Nẵng"));
        listTP.add(new ThanhPho(2, "Quảng Nam"));
        listTP.add(new ThanhPho(3, "Hà Nội"));
        listTP.add(new ThanhPho(4, "Quảng Bình"));
        listTP.add(new ThanhPho(1, "List Component"));
        listTP.add(new ThanhPho(2, "Quảng Bình"));
        listTP.add(new ThanhPho(3, "Hà Tỉnh"));
        listTP.add(new ThanhPho(4, "Quảng Ninh"));
        listTP.add(new ThanhPho(1, "Đà Lạt"));
        listTP.add(new ThanhPho(2, "Phú Yên"));
        listTP.add(new ThanhPho(3, "Ninh Thuận"));
        listTP.add(new ThanhPho(4, "Khánh Hòa"));
    }

    @Override
    public int getSize() {
        return listTP.size();
    }

    @Override
    public ThanhPho getElementAt(int index) {
        return listTP.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
