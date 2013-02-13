package jp.ktsystem.ambitious.designpattern.singleton.sample1;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Cache-able singleton class.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class CacheableSingletonClass {

	/** Cache. */
	private Map<String, String> cacheData = new HashMap<String, String>();

	private static CacheableSingletonClass instance = new CacheableSingletonClass();

	private CacheableSingletonClass() {
	}

	// ----- public

	public static CacheableSingletonClass getInstance() {
		return instance;
	}

	/**
	 * Get data.<br>
	 *
	 * If the data in cache, returns data from cache.
	 * Otherwise, Get data and cache.
	 *
	 * @param key String
	 * @return data
	 */
	public String getData(String key) {

		if (cacheData.containsKey(key)) {
			return cacheData.get(key);
		}

		// Get data for cache(and return).
		String data = new String();

		cacheData.put(key, data);
		return data;
	}

}
