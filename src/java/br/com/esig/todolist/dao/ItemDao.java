package br.com.esig.todolist.dao;

import br.com.esig.todolist.entity.Item;
import br.com.esig.todolist.util.HibernateUtil;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemDao {

    private Session sessao;
    private Transaction trans;

    public List<Item> getList() {
        List<Item> list = new ArrayList<>();
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            Criteria cri = sessao.createCriteria(Item.class);
            list = cri.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        
        return list;
    }

    public void addItem(Item i) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            Item item = new Item();
            item.setValue(i.getValue());
            item.setDone(i.isDone());

            sessao.save(item);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
    }

    public void removeItem(Item i) {
        try {     
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            sessao.delete(i);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
    }
    
    public void updateItem(Item i) {
        try {     
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            sessao.update(i);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
    }
}
