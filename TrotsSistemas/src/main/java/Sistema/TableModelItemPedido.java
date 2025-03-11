/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class TableModelItemPedido extends AbstractTableModel {

    private List<ItemPedido> ListaItemPedido;

    @Override
    public int getRowCount() {
        return ListaItemPedido.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemPedido item = ListaItemPedido.get(rowIndex);
        
        switch (columnIndex){
            case 0: return item.getSabor();
            case 1: return item.getPeso();
            case 2: return item.getQdte();
            case 3: return item.getValor();
        }
    }

    @Override
    public String getColumnName(int column) {
        String nome[] = ["a"];
        return super.getColumnName(column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void getItem(ItemPedido item) {
        ListaItemPedido.remove(item);
        fireTableRowsDeleted(ListaItemPedido.size() - 1, ListaItemPedido.size() - 1);
    }
    
    public void inserir(ItemPedido item) {
        ListaItemPedido.add(item);
        fireTableRowsInserted(ListaItemPedido.size() - 1, ListaItemPedido.size() - 1);
    }
    
    public void deletar(int index) {
        ListaItemPedido.remove(index);
        fireTableRowsDeleted(ListaItemPedido.size() - 1, ListaItemPedido.size() - 1);
    }
    
    public void getLista(){
        ListaItemPedido.remove(item);
        fireTableRowsDeleted(ListaItemPedido.size() - 1, ListaItemPedido.size() - 1);
    }
    
    
    

}
