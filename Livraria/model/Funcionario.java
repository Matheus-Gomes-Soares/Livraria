package model;

import java.util.List;

public class Funcionario extends Usuario implements Comunicacao {
    String codigoFunc;
    List<String> msgs;
    
    @Override
    public void setMsg(String msg) {
        msgs.add(msg);
    }


}
