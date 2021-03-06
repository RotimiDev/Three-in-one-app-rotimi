// Generated by Dagger (https://dagger.dev).
package com.example.punchandroidtest.repository;

import com.example.punchandroidtest.data.remote.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RealEstateRepository_Factory implements Factory<RealEstateRepository> {
  private final Provider<Api> apiProvider;

  public RealEstateRepository_Factory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RealEstateRepository get() {
    return newInstance(apiProvider.get());
  }

  public static RealEstateRepository_Factory create(Provider<Api> apiProvider) {
    return new RealEstateRepository_Factory(apiProvider);
  }

  public static RealEstateRepository newInstance(Api api) {
    return new RealEstateRepository(api);
  }
}
