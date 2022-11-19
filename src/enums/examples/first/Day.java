package enums.examples.first;

//Object -> Enum -> Day
public enum Day
{
    MONDAY("Понедельник"), //new Day()
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String translation;

    Day(){}
    Day(String translation)
    {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
