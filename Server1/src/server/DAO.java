package server;

public interface DAO<K, V> {
  final int GET = 1;
  final int ADD = 2;
  final int DELETE = 3;
  final int UPDATE = 4;
  final int SIZE = 5;
  final int PORT = 4444;
  final String HOST = "10.0.2.2";

  V get(K key);

  void add(K key, V value);

  void delete(K key);

  void update(K key, V value);
  
  int size();
}