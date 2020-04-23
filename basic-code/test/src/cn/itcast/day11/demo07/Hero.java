package cn.itcast.day11.demo07;

public class Hero {

    private String name;
    private Skill skill;

    public Hero(){

    }
    public Hero(String name, Skill skill){
        this.name = name;
        this.skill = skill;
    }

    public void show(){
        System.out.println("我叫"+name+"我要施放技能了");
        skill.usb();
        System.out.println("施放技能结束");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Skill getSkill(){
        return skill;
    }
    public void setSkill(Skill skill){
        this.skill = skill;
    }

}
