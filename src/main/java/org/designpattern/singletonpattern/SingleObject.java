package org.designpattern.singletonpattern;

public class SingleObject {
 
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();
  
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}
    private String name;
    public void setName(String name){
      this.name=name;
    }

    public String getName(){
      return this.name;
    }
  
    //获取唯一可用的对象
    public static SingleObject getInstance(){
       return instance;
    }
  
    public void showMessage(){
      if (name != null) {
         System.out.println(name+" say:'Hello World!'");
      }else{
         System.out.println("Hello World!");
      }
       
    }
 }
