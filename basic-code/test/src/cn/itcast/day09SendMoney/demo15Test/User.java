package cn.itcast.day09SendMoney.demo15Test;

public class User {

    private String name;
    private int money;

    public User(){

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫"+name+"我有"+money+"RMB");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
