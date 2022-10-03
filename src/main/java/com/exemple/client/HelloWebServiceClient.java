package com.exemple.client;

import com.exemple.generate.HelloWebService;
import com.exemple.generate.HelloWebServiceImplService;
import com.exemple.generate.Users;
import com.exemple.model.User;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
//        // создаем ссылку на wsdl описание
//        URL url = new URL("http://localhost:8081/wss/first?wsdl");
//
//        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
//        // 1-ый аргумент смотрим в атрибуте targetNamespace
//        // 2-ой аргумент смотрим в атрибуте name
//        QName qname = new QName("http://server.dobrodey.ru/", "HelloWebServiceImplService");
//
//        // Теперь мы можем дотянуться до тега service в wsdl описании,
//        Service service = Service.create(url, qname);

        URL url = new URL("http://localhost:8081/wss/first?wsdl");
        HelloWebServiceImplService servicehe = new HelloWebServiceImplService(url);
        HelloWebService hello = servicehe.getHelloWebServiceImplPort();
//
//        // Ура! Теперь можно вызывать удаленный метод
        System.out.println("Hello OLga: "+hello.getHelloString("Olga"));
        System.out.println("Print list string"+hello.getList("Olha").getItem());
        System.out.println("Print list string"+hello.getList("Olha"));

        System.out.println("Print user: "+hello.getUser().toString());
        User user = new User(hello.getUser().getId(), hello.getUser().getName());
        System.out.println(user);

        System.out.println("Print user Name: "+hello.getUser().getName());
        System.out.println("Print summa: "+hello.add(1,3));
        System.out.print("List of String: "+ hello.getList1("1").getItem());
        System.out.print("List of Users: ");
        hello.getList1("1").getItem().stream().forEach(users1 -> System.out.println(users1.getName()+ " "+ users1.getId()));
    }
}
