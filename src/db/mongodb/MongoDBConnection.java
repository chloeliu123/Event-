package db.mongodb;

import java.util.List;
import java.util.Set;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import db.DBConnection;
import entity.Item;

public class MongoDBConnection implements DBConnection {

	private static MongoDBConnection instance;

	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new MongoDBConnection();
		}
		return instance;
	}

	private MongoClient mongoClient;
	private MongoDatabase db;

	private MongoDBConnection() {
		// Connects to local mongodb server.
		mongoClient = new MongoClient();
		db = mongoClient.getDatabase(MongoDBUtil.DB_NAME);
	}

	@Override
	public void close() {
		if (mongoClient != null) {
			mongoClient.close();
		}
	}

	@Override
	public void setFavoriteItems(String userId, List<String> itemIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetFavoriteItems(String userId, List<String> itemIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getFavoriteItemIds(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Item> getFavoriteItems(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getCategories(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> searchItems(String userId, double lat, double lon, String term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItem(Item item) {
		// TODO Auto-generated method stub
		
	}
}
