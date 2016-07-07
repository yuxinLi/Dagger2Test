package com.example.dagger2test.di.modules;

import com.example.dagger2test.Product;
import com.example.dagger2test.di.scopes.ProductLevel;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：lyx on 2016/7/6 17:49
 */
@Module
public class ProductModule {

    @Provides
    @ProductLevel("good")
   public Product privideGoodProduct(){
       return new Product("good");
   }

    @Provides
    @ProductLevel("bad")
    public Product privideBadProduct(){
        return new Product("bad");
    }


}
