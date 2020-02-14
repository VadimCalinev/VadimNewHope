package getSetHomework;

class Box  {
    /**
     2 Любой обьект, который имплементирует данный интерфейс.
     */
    ThingInteface content;

    public ThingInteface getContent() {
        return content;
    }
//ThingInterface в данном случае являеться Т модификатором.
    public void setContent(ThingInteface content) {
        this.content = content;
    }
// 3 Мы не можем достучаться на прмяую, так как мы сделали перменные приватными. Только через сеттеры.


}