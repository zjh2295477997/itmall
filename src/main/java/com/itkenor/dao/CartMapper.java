package com.itkenor.dao;

import com.itkenor.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdAndProductId(@Param("userId") Integer userId,@Param("productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int setlectCartProductCheckedByUserId(Integer userId);

    int delectCartProductCheckedByUserIdAndProductIds(@Param("userId") Integer userId,@Param("productIds") List<String> productIds);

    int selectOrUnselect(@Param("checked") Integer checked ,@Param("userId") Integer userID,@Param("productId") Integer productId);

    int selectCartProductCount(Integer userId);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}