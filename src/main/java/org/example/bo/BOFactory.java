package org.example.bo;

import org.example.bo.custom.impl.StudentBOImpl;

public class BOFactory {

    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBOFactory(){
        return (boFactory==null)?boFactory=new BOFactory():boFactory;
    }
    public enum BOTypes{
        STUDENT
    }
    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case STUDENT:
                return new StudentBOImpl();
            default:
                return null;
        }
    }
}

