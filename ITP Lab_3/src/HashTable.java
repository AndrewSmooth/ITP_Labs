import java.util.ArrayList;

class HashTable<Key,Value> {

    private int size;
    private ArrayList<Integer> indexes;
    private ArrayList<ArrayList<Value>> values;
    private ArrayList<ArrayList<Key>> keys;

    HashTable() {
        size = 0;
        indexes = new ArrayList<Integer>();
        values = new ArrayList<ArrayList<Value>>();
        keys = new ArrayList<ArrayList<Key>>();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0? true : false;
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode());
    }

    public void put(Key key, Value value) {
        int hash = hash(key);
        if (!indexes.contains(hash)) {
            indexes.add(hash);
            ArrayList<Value> this_hash_values_table = new ArrayList<Value>();
            this_hash_values_table.add(value);

            ArrayList<Key> this_hash_keys_table = new ArrayList<Key>();
            this_hash_keys_table.add(key);

            values.add(this_hash_values_table);
            keys.add(this_hash_keys_table);

            this.size++;
        }
        else {
            if (keys.get(indexes.indexOf(hash)).contains(key)) {
                values.get(indexes.indexOf(hash)).add(keys.get(indexes.indexOf(hash)).indexOf(key), value);
            }
            else {
                keys.get(indexes.indexOf(hash)).add(key);
                values.get(indexes.indexOf(hash)).add(value);
                this.size++;
            }
        }
    }
    public void remove(Key key_for_removal) {
        int hash = hash(key_for_removal);
        if(indexes.contains(hash)){
            if (values.get(indexes.indexOf(hash)).size() == 1) {
                values.remove(indexes.indexOf(hash));
                keys.remove(indexes.indexOf(hash));
                indexes.remove(indexes.indexOf(hash));
            }
            else {
                values.get(indexes.indexOf(hash)).remove(keys.indexOf(key_for_removal));
                keys.get(hash).remove(key_for_removal);
            }
            this.size--;

        }
    }
    public Value get(Key key) {

        int hash = hash(key)
;
        if(indexes.contains(hash)){
            if (values.get(indexes.indexOf(hash)).size() == 1) {
                return values.get(indexes.indexOf(hash)).get(0);
            }
            else if (values.contains(indexes.indexOf(hash))){
                return values.get(indexes.indexOf(hash)).get(keys.get(indexes.indexOf(hash)).indexOf(key));
            }
        }
        return null;
    }
}