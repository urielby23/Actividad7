package com.urielby.actividad7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerProducts;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupProducts();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerProducts = findViewById(R.id.recyclerProducts);
    }

    private void setupProducts() {
        productList = new ArrayList<>();

        productList.add(new Product(
                "🪖 Casco Stormtrooper",
                "Réplica coleccionable del casco de un Stormtrooper clásico.",
                "https://m.media-amazon.com/images/I/61DI7byh39L._AC_SX679_.jpg",
                "https://www.amazon.com.mx/Star-Wars-Awakens-Stormtrooper-Helmet/dp/B00TP50VK0?th=1"
        ));

        productList.add(new Product(
                "⚔️ Sable de luz de Luke Skywalker",
                "Sable de luz verde con efectos de sonido y luz LED.",
                "https://m.media-amazon.com/images/I/51k+ZZGOZpL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/Star-Wars-SW-Key-Luke/dp/B0D9PG4CJQ/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.DVQjcGGcP6P1qkSDOxS3-Ap4UrR9VrAC1__nwQLnMPzK2RAfdRgznDJj0YxZYT5p-Af-MdAyRLoL8vfBYEXr-Msm2wYABB8_f5SPV61ghwlo3C1MisU4yrnHaH4lnlL42UhQb1BU1BJU5wfsgHWCDwJFe0MxX1veWu2T8d-q-_gJtC2GO-us5OX6ErI5r2r-cisKZMRVCNVZZIf5Q3xANTmnFcUTT8jxZxq7T3uN7ozI4ntIoSPX-YVdEsxPrDx5dggHw0H0MairejaVXSLH3liWhl1uTSNKveX_yZJdn8c.cu4PSF76U9JAIUjJLjl2fVYU0Ic5iprXSnUuJeL3pLc&dib_tag=se&keywords=Sable+de+luz+de+Luke+Skywalker&qid=1759562787&sr=8-1-spons&ufe=app_do%3Aamzn1.fos.1f47693a-e1a6-4b06-ba29-28033858cf82&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"
        ));

        productList.add(new Product(
                "🤖 Figura de Grogu (Baby Yoda)",
                "Figura coleccionable de The Mandalorian.",
                "https://m.media-amazon.com/images/I/91OqPNYOsIL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/Star-Wars-Sonidos-Movimiento-Juguetes/dp/B09NZD9S1M/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.HuHL6ScKlTbYtdbwyra6XRyXGHd5ZPxpdCQOdAkM61bHW8Ub6EvabSiOCrrJtdCRC7T1EG_VL04d6gcOBmM5l5V7SENZotFEVcb-aha52H6NDrKVX8vYfkgsoxfgFRH89-bkyrhzstCze4BywQvYPlC2j18yfP2vQqUFeLt-FDJbtI-2ALlCv9BDu4m0HTHVjKu_92AiAcpXE0IChVtl5lqIlOLxtYgxNpElL7OYe3iIPK2S7EVT87ZjP1oOsk_iDCZ_I9VKOXGSX7LD4dTvAcOeXfucTQ5R1sLQ200l9tI.h4xwWjzNS8cG4ksBL4-9r2oaN61-xq82cVCpuqZuXD4&dib_tag=se&keywords=Figura+de+Grogu+%28Baby+Yoda%29&qid=1759562854&sr=8-1-spons&ufe=app_do%3Aamzn1.fos.de93fa6a-174c-4df7-be7c-5bc8e9c5a71b&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"
        ));

        productList.add(new Product(
                "👽 Figura de Yoda",
                "Figura de acción coleccionable de Yoda clásico.",
                "https://m.media-amazon.com/images/I/61ICLyZBnPL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/Star-Wars-SW-Master-Yoda/dp/B0D9PHQQWV/ref=sr_1_1_sspa?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3UKEAFP2JSIAF&dib=eyJ2IjoiMSJ9.aQlFDEDNdwlzUpXwQy0p5wf5Vrc2H2wMgdid_ngaoOwSLzbVCVYwZFLwWIq3MSgetHj5iTV9SXRitdKiyFhhOrekw0NOMj066c3cJUaCVBbOu9wARHWcvyEVUhdMIzLMrVofq8tJnDlD3lTTV8Dmiiu3QrInVcOg1xXAMgGnm3zt5Apjmh0PWoHKjooCuUVp8eHJmsz2JwYINe8ImzrBPdIEMXBZN75KtOeN7zYx2XwWyCd2BwFcaqf2RXkpHubEzaqJ3LOzvcM2lNRZ2Cv5nBhZ91eM2oKggRz8YUXZHcc.8K903BErzbYLQ6Ri3gLOir50jDo0ttXpcTvvuaZNQ4Q&dib_tag=se&keywords=Figura+de+Yoda&qid=1759562923&sprefix=figura+de+yoda%2Caps%2C176&sr=8-1-spons&ufe=app_do%3Aamzn1.fos.1f47693a-e1a6-4b06-ba29-28033858cf82&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"
        ));

        productList.add(new Product(
                "🚀 Halcón Milenario LEGO",
                "Set LEGO Star Wars del Halcón Milenario.",
                "https://m.media-amazon.com/images/I/81jbkbN83BL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/MilenarioTM-Personajes-emblem%C3%A1tica-Aniversario-75375/dp/B0CGY3ZB24/ref=sr_1_5?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1F4KHGOKG60RQ&dib=eyJ2IjoiMSJ9.BXdaQ4cRK9snn_5XUTuDULLHdj69fE1dE8o2JYrgAE3SwXxmov5GWQfNLB7ffmRQdIeNKqOaBklpIIB7U9oCe8yWVk6rvD0YWyTbJ2gmWA144D7FTwGB-1sIt27av03d0epBNURktEVAjXiYhRdACwEkWdj-Me4IqzFqSJFsFlVTfP0cg9JvnNMGDhuQYj__NjbxwcRv60pX293wKzG4pFbUGxEd-iDHoErltGlW1Jix6CEksjiBSof9mCrbYCLLLws9zexR5yELT6XCdvU7oYMfl4eiSmoWawBq9R731J8.3qZg88h6jZFD_SwDYccQ7TuAl9E8TemD5BQKEFQSyqU&dib_tag=se&keywords=halcon%2Bmilenario%2Blego&qid=1759562994&sprefix=halc%C3%B3n%2Bmilenario%2Blego%2Caps%2C119&sr=8-5&ufe=app_do%3Aamzn1.fos.de93fa6a-174c-4df7-be7c-5bc8e9c5a71b&th=1"
        ));
    }
    private void setupRecyclerView() {
        productAdapter = new ProductAdapter(this, productList);
        recyclerProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerProducts.setAdapter(productAdapter);
    }
}