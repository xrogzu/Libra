/*
 * Copyright 2005-2015 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.shopxx.service;

public interface CacheService {

	String getDiskStorePath();

	int getCacheSize();

	void clear();

}