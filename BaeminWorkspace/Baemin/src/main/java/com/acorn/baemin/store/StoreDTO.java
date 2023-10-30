package com.acorn.baemin.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreDTO {
	int storeCode;
	String storeName;
	String storeCategory;
	String storeImage;
	String storeAddress;
	String storePhone;
	int zzimCount;
	int reviewCount;
	double storeRating;
	String storeDescription;
	int minOrderPrice;
	int deliveryFee;
	String operatingTime;
	String deliveryArea;
	int storeStatus;


}
