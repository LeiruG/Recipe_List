package com.gelves.uriel.recipe_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rView)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val food = ArrayList<Food>()
        food.add(Food("Slow cooker lamb curry",
                "Use the slow cooker to make this nutritious, easy curry and the lamb will melt in your mouth. You can batch cook and freeze the leftovers for another day",
                R.drawable.curry,
                "1 large onion\n" +
                        ", halved and sliced\n" +
                        "3 tbsp Madras curry paste\n" +
                        "400g can chopped tomatoes\n" +
                        "2 tsp vegetable bouillon powder\n" +
                        "25g red lentils\n" +
                        "210g can chickpeas (don’t drain)\n" +
                        "1 tbsp grated ginger\n" +
                        "1 tsp cumin seeds\n" +
                        "1 cinnamon stick\n" +
                        "75g curly kale\n" +
                        "2 lean lamb steaks, fat removed, diced (about 240g)\n" +
                        "cooked brown rice, to serve",
                "1.Put all of the ingredients into the slow cooker pot with a third of a can of water and stir well. Cover with the lid and chill in the fridge overnight.\n" +
                        "2.The next day, stir again, then cook on Low for 6 hrs until the lamb and vegetables are tender. Serve with brown rice."))
        food.add(Food("Leek, potato & bacon bake",
                "This bake is a cross between two classics – creamy dauphinoise and pommes boulangère (potatoes cooked in stock), the perfect side dish",
                R.drawable.bakedpotato,
                "600ml chicken or vegetable stock\n" +
                        "1kg potato\n" +
                        ", thinly sliced\n" +
                        "6 leeks\n" +
                        ", thinly sliced into rounds\n" +
                        "25g butter\n" +
                        "3-4 rashers streaky bacon, snipped\n" +
                        "3 tbsp double cream (optional)",
                "1.Heat oven to 200C/fan 180C/gas 6. Put the stock in a large pan, bring to the boil, then add the potatoes and the leeks. Bring back to the boil for 5 mins, then drain well, reserving the stock in a jug.\n" +
                        "2.Meanwhile, butter a large baking dish. Layer up the potatoes and leeks higgledypiggledy, seasoning as you go, then scatter the bacon over the top. Season well, pour over 200ml of the reserved stock, then spoon over the cream (if using) and cover with foil. Can be made up to 1 day ahead and chilled. Bake for 40 mins, uncovering halfway through so that the bacon crisps."))
        food.add(Food("Fish pie fillets",
                "Easy, quick, low-fat, and tasty - what more could you want",
                R.drawable.fishpie,
                "4 x 175g/6oz thick white fish fillets (we used haddock)\n" +
                        "small bunch dill, leaves only, chopped\n" +
                        "100g half-fat soft cheese\n" +
                        "200g frozen prawn\n" +
                        ", raw or cooked, defrosted\n" +
                        "4 sheets filo pastry\n" +
                        "2 tsp sunflower oil\n" +
                        "1 tbsp parmesan\n" +
                        ", finely grated",
                "1.Heat oven to 220C/fan 200C/gas 7. Put the fish onto a non-stick baking sheet and season all over. Mix the dill and soft cheese in a small bowl, then stir in the prawns, taking care not to break them up. Season with black pepper, then spread evenly over the fish.\n" +
                        "2.Brush the filo sheets with the oil, then cut into thick strips. Scrunch the pastry up a little and crumple on top of the fish. Scatter with parmesan, then bake for 10 mins until the fish is cooked through and the pastry is crisp and golden. (If you’ve used raw prawns, check they’re cooked through.) Serve with green beans or a salad with your choice of potatoes"))

          val adapter = CustomAdapter(food)
        rv.adapter = adapter
    }
}