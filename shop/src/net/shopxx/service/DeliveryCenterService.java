/*
 * Copyright 2005-2015 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.shopxx.service;

import net.shopxx.entity.DeliveryCenter;

public interface DeliveryCenterService extends BaseService<DeliveryCenter, Long> {

	DeliveryCenter findDefault();

}