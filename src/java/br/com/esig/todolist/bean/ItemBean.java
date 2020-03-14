package br.com.esig.todolist.bean;

import br.com.esig.todolist.dao.ItemDao;
import br.com.esig.todolist.entity.Item;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ItemBean {

    private Item item = new Item();
    private ItemDao itemDao = new ItemDao();

    public ItemBean() {
    }

    public String bootstrapView() {
        return "bootstrapView";
    }

    public String primefacesView() {
        return "primefacesView";
    }

    public String adicionarItem() {
        if (item.getValue() != "") {
            itemDao.addItem(item);
            item.setValue(null);
            item.setDone(false);
        }
        return "index";
    }

    public String removerItem(Item i) {
        itemDao.removeItem(i);
        return "index";
    }

    public String changeItemDone(Item i) {
        this.item = i;
        this.item.setDone(!this.item.isDone());
        itemDao.updateItem(item);
        item.setValue(null);
        item.setDone(false);
        return "index";
    }

    public List<Item> getLista() {
        return itemDao.getList();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
