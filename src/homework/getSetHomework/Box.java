package getSetHomework;

class Box  {
    /**
     2 Любой обьект, который имплементирует данный интерфейс.
     */
    ThingInterface content;

    public ThingInterface getContent() {
        return content;
    }
//ThingInterface в данном случае являеться Т модификатором.
    public void setContent(ThingInterface content) {
        this.content = content;
    }
// 3 Мы не можем достучаться на прмяую, так как мы сделали перменные приватными. Только через сеттеры.


}