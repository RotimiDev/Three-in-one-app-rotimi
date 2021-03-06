// Generated by Dagger (https://dagger.dev).
package com.example.punchandroidtest.di;

import com.example.punchandroidtest.data.remote.Api;
import com.example.punchandroidtest.repository.RealEstateRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRealEstateRepositoryFactory implements Factory<RealEstateRepository> {
  private final Provider<Api> apiProvider;

  public NetworkModule_ProvideRealEstateRepositoryFactory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RealEstateRepository get() {
    return provideRealEstateRepository(apiProvider.get());
  }

  public static NetworkModule_ProvideRealEstateRepositoryFactory create(Provider<Api> apiProvider) {
    return new NetworkModule_ProvideRealEstateRepositoryFactory(apiProvider);
  }

  public static RealEstateRepository provideRealEstateRepository(Api api) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRealEstateRepository(api));
  }
}
