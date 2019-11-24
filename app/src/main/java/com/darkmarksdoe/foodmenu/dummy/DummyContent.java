package com.darkmarksdoe.foodmenu.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Helper class for providing sample name for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Food> ITEMS = new ArrayList<Food>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Food> ITEM_MAP = new HashMap<String, Food>();

    private static final int COUNT = 0;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    public static void addItem(Food item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static void updateItem(Food comida) {
        ITEMS.set(ITEMS.indexOf(comida),comida);
        ITEM_MAP.put(comida.getId(),comida);
    }
    public static void deleteItem(Food comida) {
        ITEMS.remove(comida);
    }



    private static Food createDummyItem(int position) {
        return new Food(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of name.
     */
    public static class Food {
        private  String id;
        private  String name;
        private  String price;

        public Food(String id, String name, String price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public Food(String name, String price) {
            this.name = name;
            this.price = price;
        }

        public Food() {
        }


        @Override
        public String toString() {
            return name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Food food = (Food) o;
            return Objects.equals(id, food.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}

