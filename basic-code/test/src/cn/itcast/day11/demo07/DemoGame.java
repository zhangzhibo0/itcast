package cn.itcast.day11.demo07;

public class DemoGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("赵兴");

        hero.setSkill(new SkillImple());
        hero.show();

        System.out.println("============");

        Hero hero1 = new Hero();

        Skill skill = new SkillImple(){
          public void usb(){
              System.out.println("Biu1");
          }
        };
        hero1.setSkill(skill);
        hero1.setName("匿名内部类");
        hero1.show();

        System.out.println("=======");

        Hero hero2 = new Hero();

        hero2.setName("匿名内部类，匿名对象");
        hero2.setSkill(new Skill() {
            @Override
            public void usb() {
                System.out.println("Biu2");
            }
        });

        hero2.show();

    }
}
