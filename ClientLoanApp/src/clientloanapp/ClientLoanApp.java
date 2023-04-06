
package clientloanapp;

import java.util.ArrayList;


public class ClientLoanApp {

    
   

    public static float riskAssessment (Client client){
        float initScore=client.getClientScore();
        return initScore;
    }
    public static ArrayList<Client> getClientsFromSerive(){
        //TODO Rest Classrooms use with APIs//
        ArrayList<Client> clientList = new ArrayList<Client>();
        for (int i=0 ; i<100; i++)
        {
            Client temp;
           if (i%2==0){
               temp = new IndivClient();
               
           }
           else{
               temp= new BusinessClient();
           }
           clientList.add(temp);
        }
        return clientList;
    }
    public static Client GetClient( ArrayList<Client> clientList, String clientName) throws Exception{
        Client result=null;
        for (int i=0; i< clientList.size(); i++){
            if (clientList.get(i).getFirstname().equals(clientName)){
                result = clientList.get(i);
            }
        }
        if (result==null){
           throw new Exception ("Client not found");
        }
        return null;
    }
    
}
