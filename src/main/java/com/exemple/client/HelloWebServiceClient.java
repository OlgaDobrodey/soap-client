package com.exemple.client;

import com.exemple.generate.HelloWebService;
import com.exemple.generate.HelloWebServiceImplService;
import com.exemple.generate.Users;

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
        QName qname = new QName("http://server.dobrodey.ru/", "HelloWebServiceImplService");
        HelloWebServiceImplService servicehe = new HelloWebServiceImplService(url);
        HelloWebService hello = servicehe.getHelloWebServiceImplPort();
//
//        // Ура! Теперь можно вызывать удаленный метод
        System.out.println(hello.getHelloString("Olga"));
        System.out.println(hello.getList("Olha"));
        Users users = hello.getUser();
        System.out.println(users);
        System.out.println(hello.add(1,3));
    }
}
