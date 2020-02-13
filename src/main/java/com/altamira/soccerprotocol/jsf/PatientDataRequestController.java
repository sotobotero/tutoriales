package com.altamira.soccerprotocol.jsf;

import com.altamira.soccerprotocol.PatientDataRequest;
import com.altamira.soccerprotocol.jsf.util.JsfUtil;
import com.altamira.soccerprotocol.jsf.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;

@Named("patientDataRequestController")
@SessionScoped
public class PatientDataRequestController implements Serializable {

      private WebTarget webTarget;
    private Client client;
    private static final String URL_BASE ="http://ec2-18-215-224-35.compute-1.amazonaws.com:3723/PatientData-0.0.1-SNAPSHOT/" ;
    private List<PatientDataRequest> items = null;
    private PatientDataRequest selected;

    public PatientDataRequestController() {
        client = ClientBuilder.newClient();
        webTarget = client.target(URL_BASE).path("patientdata");
    }

    public PatientDataRequest getSelected() {
        return selected;
    }

    public void setSelected(PatientDataRequest selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

  

    public PatientDataRequest prepareCreate() {
        selected = new PatientDataRequest();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("PatientDataRequestCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("PatientDataRequestUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("PatientDataRequestDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<PatientDataRequest> getItems() {
        if (items == null) {
            try {
                items = findAll();
            } catch (ParseException ex) {
                Logger.getLogger(PatientDataRequestController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    create(selected);
                } else {
                    remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public PatientDataRequest getPatientDataRequest(long id) {  
        PatientDataRequest findById = null ;
          try {
               findById = findById(id);
          } catch (ParseException ex) {
              Logger.getLogger(PatientDataRequestController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return findById;
    }

    public List<PatientDataRequest> getItemsAvailableSelectMany() {
        List<PatientDataRequest> findAll = null;
          try {
               findAll = findAll();
          } catch (ParseException ex) {
              Logger.getLogger(PatientDataRequestController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return findAll;
    }

    public List<PatientDataRequest> getItemsAvailableSelectOne() {
          List<PatientDataRequest> findAll = null;
          try {
            findAll = findAll();
          } catch (ParseException ex) {
              Logger.getLogger(PatientDataRequestController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return findAll;
    }

    @FacesConverter(forClass = PatientDataRequest.class)
    public static class PatientDataRequestControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PatientDataRequestController controller = (PatientDataRequestController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "patientDataRequestController");
            return controller.getPatientDataRequest(getKey(value));
        }

        long getKey(String value) {
            long key;
            key = Long.parseLong(value);
            return key;
        }

        String getStringKey(long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof PatientDataRequest) {
                PatientDataRequest o = (PatientDataRequest) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), PatientDataRequest.class.getName()});
                return null;
            }
        }

    }
    
         public List<PatientDataRequest> findAll() throws ParseException {  
        WebTarget resource = webTarget;     
        String get = resource.request(MediaType.APPLICATION_JSON).get(String.class);
        return castToList(get);       
    }

 

    public PatientDataRequest findById(Long id) throws ParseException {  
        WebTarget resource = webTarget;
        resource.path(MessageFormat.format("{0}", new Object[]{id}));
        String get = resource.request(MediaType.APPLICATION_JSON).get(String.class);
        return new PatientDataRequest(get);
        
    }

     public List<PatientDataRequest> castToList(String jsonArrayString) throws ParseException {
       JSONArray  JsonArrayList = new JSONArray(jsonArrayString);
       List<PatientDataRequest> list = new ArrayList<>();
       for(int i=0;i<JsonArrayList.length();i++){
           PatientDataRequest btr =  new PatientDataRequest(JsonArrayList.get(i).toString());
           list.add(btr);
       }
       return list;
    }
     
     
      private void remove (PatientDataRequest entity){
        String id = String.valueOf(entity.getId())+"";
         WebTarget resource = webTarget;
        resource.path(MessageFormat.format("{0}", new Object[]{id})).request().delete();
    }
	
	
	
	private void create (PatientDataRequest entity) throws Exception{
            Response response = webTarget.request(MediaType.APPLICATION_JSON).
                post(Entity.entity(entity, MediaType.APPLICATION_JSON),Response.class);
        
        if(response.getStatus() != Response.Status.OK.getStatusCode()){
            throw new Exception("unabled to created entity " + response.getStatus());
        }      
    }
     
}
