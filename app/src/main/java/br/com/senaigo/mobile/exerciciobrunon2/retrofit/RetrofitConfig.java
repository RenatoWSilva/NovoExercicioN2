package br.com.senaigo.mobile.exerciciobrunon2.retrofit;


import br.com.senaigo.mobile.exerciciobrunon2.service.CEPService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;


public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://goo.gl/YHHg6x")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public CEPService getCEPService() {
        return this.retrofit.create(CEPService.class);
    }

}
