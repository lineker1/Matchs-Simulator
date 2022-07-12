package me.dio.simulator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import me.dio.simulator.databinding.ActivityDetailAcitivityBinding
import me.dio.simulator.domain.Match

class DetailAcitivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA.MATCH"
    }

    private lateinit var binding: ActivityDetailAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFronExtra()


    }

    private fun loadMatchFronExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let {
            Glide.with(this).load(it.place.image).into(binding.ivPlace)
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.descricao

            Glide.with(this).load(it.homeTeam.image).into(binding.ivHomeTeam)
            binding.tvHomeTeamName.text = it.homeTeam.name
            binding.rbHomeTeamStars.rating = it.homeTeam.stars.toFloat()
            if(it.homeTeam.score != null){
                binding.tvHomeTeamScore.text = it.homeTeam.score.toString()
            }

            Glide.with(this).load(it.visitantTeam.image).into(binding.ivAwayTeam)
            binding.tvAwayTeamName.text = it.visitantTeam.name
            binding.rbAwayTeamStars.rating = it.visitantTeam.stars.toFloat()
            if(it.visitantTeam.score != null){
                binding.tvAwayTeamScore.text = it.visitantTeam.score.toString()
            }
        }
    }


}