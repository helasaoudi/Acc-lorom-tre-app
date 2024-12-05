package com.example.test_jenkins;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.cardview.widget.CardView;

public class CardActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.card_activity);

        // Gestion de l'UI des fenêtres système
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Récupérer la CardView de card2 et définir un listener pour l'action de clic
        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(v -> {
            // Créez une intention pour démarrer l'activité ListeGymActivity
            Intent intent = new Intent(CardActivityActivity.this, GymList.class);
            startActivity(intent); // Lance l'activité
        });
    }
}
