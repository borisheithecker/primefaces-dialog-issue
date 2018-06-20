/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thespheres.primefaces.dialog.issue;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dfDialogView")
@ViewScoped
public class DFDialogView implements Serializable {

    private String selectedItem;

    public String[] getItems() {
        return new String[]{"1", "2", "3"};
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
        System.out.println("Selected item set.");//This is not invoked form p:dialog variant!
    }

    public void onButtonClick() {
        System.out.println("Button clicked.");
    }

}
