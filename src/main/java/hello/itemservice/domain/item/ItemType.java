package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("本"),
    FOOD("食べ物"),
    ETC("その他");
    private final String description;
    ItemType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
