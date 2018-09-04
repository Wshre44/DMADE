package com.j3technology.application;


import com.j3technology.model.AccountGroup;
//import org.hibernate.Session;
//import org.hibernate.Transaction;

/**
 *
 * @author Ganraj
 */
public class MastersDaoImpl implements MastersDao{

    @Override
    public void saveData(AccountGroup account) {
//         Session session = HibernateUtil.getSessionFactory().openSession() ;
//		Transaction trans = session.beginTransaction();
//		session.saveOrUpdate(account);
//		trans.commit();
//                session.flush();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * Company masters methods
     * @param company 
     */
//    @Override
//    public void saveData(CompanyMaster company) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//		Transaction trans = session.beginTransaction();
//		session.saveOrUpdate(company);
//		trans.commit();
//                session.flush();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public List<CompanyMaster> getAllCompanyData() {
//        List<CompanyMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from CompanyMaster");
//                 list = hql.list();  
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//    
//    @Override
//    public List<String> getCompanyNameList() {
//        List<String> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("select c.company_name from CompanyMaster c");
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//    
//    @Override
//    public void updateCompany(CompanyMaster company) {
//        String query = "from CompanyMaster where company_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", company.getCompany_code());
//                CompanyMaster data = (CompanyMaster) hql.uniqueResult();
//                data.setCompany_name(company.getCompany_name());
//                data.setCompany_shortName(company.getCompany_shortName());
//                session.save(data);
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public void removeCompany(String code) {
//        String query = "delete from CompanyMaster where company_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    /**
//     * Doctor Master methods implementation
//     * @param doctors 
//     */
//    @Override
//    public void saveDoctorsData(DoctorMaster doctors) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(doctors);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public List<DoctorMaster> getAllDoctorsData() {
//        List<DoctorMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from DoctorMaster");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//
//    @Override
//    public List<DoctorMaster> getDoctor(String code) {
//        List<DoctorMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from DoctorMaster where doctor_code = :CODE");
//            hql.setParameter("CODE", code);
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//
//    @Override
//    public void removeDoctor(String code) {
//        String query = "delete from DoctorMaster where doctor_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//    /**
//     * Generic Master methods implementation
//     */
//    @Override
//    public void saveGenericData(GenericMaster generic) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(generic);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public List<GenericMaster> getAllGenericData() {
//        List<GenericMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from GenericMaster");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;  
//    }
//    
//    @Override
//    public List<String> getGenericNameList() {
//        List<String> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("select g.generic from GenericMaster g");
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//    
//    @Override
//    public void removeGeneric(String code) {
//        String query = "delete from GenericMaster where code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//    /**
//     * GST Master method implementation
//     * @param gst 
//     */
//    @Override
//    public void saveGSTData(GSTMaster gst) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(gst);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//    @Override
//    public List<GSTMaster> getAllGSTData() {
//        List<GSTMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from GSTMaster");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;  
//    }
//    @Override
//    public List<String> getGSTSlabList() {
//       List<String> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("select g.tax_slab from GSTMaster g");
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list; 
//    }
//    @Override
//    public List<GSTMaster> getGST(String code) {
//        List<GSTMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from GSTMaster where code = :CODE");
//            hql.setParameter("CODE", code);
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//
//    @Override
//    public void removeGST(String code) {
//        String query = "delete from GSTMaster where code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	} 
//    }
//    /**
//     * Patient Master method implementation
//     * @param patient 
//     */
//    @Override
//    public void savePatientData(PatientMaster patient) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(patient);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//    @Override
//    public List<PatientMaster> getAllPatientData() {
//        List<PatientMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from PatientMaster");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;  
//    }
//    @Override
//    public List<PatientMaster> getPatient(String code) {
//        List<PatientMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from PatientMaster where patient_code = :CODE");
//            hql.setParameter("CODE", code);
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//    @Override
//    public void removePatient(String code) {
//        String query = "delete from PatientMaster where patient_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	} 
//    }
//    /**
//     * Salesman Master
//     * @param salesman 
//     */
//    @Override
//    public void saveSalesmanData(SalesmanMaster salesman) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(salesman);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public List<SalesmanMaster> getAllSalesmanData() {
//        List<SalesmanMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from SalesmanMaster");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;  
//    }
//
//    @Override
//    public List<SalesmanMaster> getSalesman(String code) {
//        List<SalesmanMaster> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from SalesmanMaster where salesman_code = :CODE");
//            hql.setParameter("CODE", code);
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//
//    @Override
//    public void removeSalesman(String code) {
//       String query = "delete from SalesmanMaster where salesman_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}  
//    }
//    
//    /**
//     * Item Entry methods
//     * @param item 
//     */
//    @Override
//    public void saveItemData(ItemEntry item) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.beginTransaction();
//            session.saveOrUpdate(item);
//            trans.commit();
//            session.clear();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//    }
//
//    @Override
//    public List<ItemEntry> getAllItemData() {
//        List<ItemEntry> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from ItemEntry");
//                 list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;  
//    }
//
//    @Override
//    public List<ItemEntry> getItem(String code) {
//        List<ItemEntry> list = new ArrayList();
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery("from ItemEntry where item_code = :CODE");
//            hql.setParameter("CODE", code);
//            list = hql.list();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}
//        return list;
//    }
//
//    @Override
//    public void removeItem(String code) {
//        String query = "delete from ItemEntry where item_code = :CODE";
//        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Query hql = session.createQuery(query);
//                hql.setParameter("CODE", code);
//                int result = hql.executeUpdate();
//	} catch (HibernateException he) {
//            he.printStackTrace();
//	}  
//    }
    
}
