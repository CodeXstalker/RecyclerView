package com.example.recyclerview.activites.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.activites.adapter.ContactListAdapter
import com.example.recyclerview.activites.modalClass.ContactModal
import com.example.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var contactList: List<ContactModal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val linearLayoutManager = LinearLayoutManager(this)
        binding.ContactList.layoutManager = linearLayoutManager


        contactList = listOf(
            ContactModal("John Doe", "A software developer"),
            ContactModal("Jane Doe", "A designer"),
            ContactModal("Bob Smith", "An engineer"),
            ContactModal("Alice Johnson", "A project manager"),
            ContactModal("Michael Brown", "A data analyst"),
            ContactModal("Sarah Davis", "A marketing specialist"),
            ContactModal("Chris Wilson", "A UX/UI designer"),
            ContactModal("Emily Taylor", "A product manager"),
            ContactModal("James Brown", "A QA tester"),
            ContactModal("Jessica Williams", "A front-end developer"),
            ContactModal("David Johnson", "A back-end developer"),
            ContactModal("Jennifer Davis", "A UI/UX designer"),
            ContactModal("Matthew Wilson", "A system administrator"),
            ContactModal("Laura Taylor", "A business analyst"),
            ContactModal("Brian Smith", "A database administrator"),
            ContactModal("Stephanie Davis", "A content writer"),
            ContactModal("Kevin Brown", "A mobile app developer"),
            ContactModal("Nicole Williams", "A DevOps engineer"),
            ContactModal("Brandon Davis", "A network engineer"),
            ContactModal("Natalie Wilson", "A UX researcher"),
            ContactModal("Daniel Johnson", "A software architect"),
            ContactModal("Olivia Taylor", "A game developer"),
            ContactModal("Michael Smith", "A product owner"),
            ContactModal("Kimberly Davis", "A systems analyst"),
            ContactModal("Joseph Wilson", "A cloud engineer"),
            ContactModal("Ava Taylor", "A UI designer"),
            ContactModal("William Brown", "A full-stack developer"),
            ContactModal("Mia Davis", "A technical writer"),
            ContactModal("Ethan Wilson", "A cybersecurity analyst"),
            ContactModal("Chloe Johnson", "A data scientist"),
            ContactModal("Alexander Taylor", "A solutions architect"),
            ContactModal("Ella Smith", "A machine learning engineer"),
            ContactModal("Liam Davis", "A game designer"),
            ContactModal("Aiden Wilson", "A software tester"),
            ContactModal("Zoe Johnson", "A UI developer"),
            ContactModal("Mason Taylor", "A UX designer"),
            ContactModal("Harper Smith", "A front-end developer"),
            ContactModal("Scarlett Davis", "A back-end developer"),
            ContactModal("Aria Wilson", "A mobile app developer"),
            ContactModal("Grayson Johnson", "A DevOps engineer"),
            ContactModal("Luna Taylor", "A database administrator"),
            ContactModal("Lucas Brown", "A UI/UX designer"),
            ContactModal("Lily Davis", "A system administrator"),
            ContactModal("Logan Wilson", "A business analyst"),
            ContactModal("Emma Johnson", "A content writer"),
            ContactModal("Liam Smith", "A QA tester"),
            ContactModal("Aiden Davis", "A front-end developer"),
            ContactModal("Zoe Wilson", "A back-end developer"),
            ContactModal("Mia Johnson", "A UI/UX designer"),
            ContactModal("Ella Taylor", "A system administrator"),
            ContactModal("Ava Smith", "A business analyst"),
            ContactModal("Olivia Davis", "A database administrator"),
            ContactModal("Sophia Wilson", "A content writer"),
            ContactModal("Isabella Johnson", "A mobile app developer"),
            ContactModal("Mason Brown", "A DevOps engineer"),
            ContactModal("Aiden Taylor", "A network engineer"),
            ContactModal("Charlotte Smith", "A UX researcher"),
            ContactModal("Liam Wilson", "A software architect"),
            ContactModal("Ava Davis", "A game developer"),
            ContactModal("Emma Taylor", "A product owner"),
            ContactModal("Olivia Brown", "A systems analyst"),
            ContactModal("Sophia Davis", "A cloud engineer"),
            ContactModal("Isabella Wilson", "A UI designer"),
            ContactModal("Mia Taylor", "A full-stack developer"),
            ContactModal("Ava Brown", "A technical writer"),
            ContactModal("Charlotte Davis", "A cybersecurity analyst"),
            ContactModal("Liam Johnson", "A data scientist"),
            ContactModal("Olivia Wilson", "A solutions architect"),
            ContactModal("Emma Smith", "A machine learning engineer"),
            ContactModal("Sophia Taylor", "A game designer"),
            ContactModal("Isabella Davis", "A software tester"),
            ContactModal("Mia Smith", "A UI developer"),
            ContactModal("Ava Wilson", "A UX designer"),
            ContactModal("Charlotte Taylor", "A front-end developer"),
            ContactModal("Liam Smith", "A back-end developer"),
            ContactModal("Olivia Johnson", "A mobile app developer"),
            ContactModal("Sophia Smith", "A DevOps engineer"),
            ContactModal("Isabella Taylor", "A database administrator"),
            ContactModal("Mia Davis", "A UI/UX designer"),
            ContactModal("Ava Johnson", "A system administrator"),
            ContactModal("Charlotte Smith", "A business analyst"),
            ContactModal("Liam Davis", "A content writer"),
            ContactModal("Olivia Smith", "A QA tester"),
            ContactModal("Sophia Davis", "A front-end developer"),
            ContactModal("Isabella Johnson", "A back-end developer"),
            ContactModal("Mia Wilson", "A mobile app developer"),
            ContactModal("Ava Davis", "A DevOps engineer"),
            ContactModal("Charlotte Johnson", "A network engineer"),
            ContactModal("Liam Taylor", "A UX researcher"),
            ContactModal("Olivia Davis", "A software architect"),
            ContactModal("Sophia Wilson", "A game developer"),
            ContactModal("Isabella Brown", "A product owner"),
            ContactModal("Mia Taylor", "A systems analyst"),
            ContactModal("Ava Smith", "A cloud engineer"),
            ContactModal("Charlotte Davis", "A UI designer"),
            ContactModal("Liam Brown", "A full-stack developer"),
            ContactModal("Olivia Taylor", "A technical writer"),
            ContactModal("Sophia Smith", "A cyber security analyst"),
            ContactModal("Isabella Taylor", "A data scientist"),
            ContactModal("Mia Brown", "A solutions architect"),
            ContactModal("Ava Brown", "A machine learning engineer"),
            ContactModal("Charlotte Taylor", "A game designer"),
            ContactModal("Liam Smith", "A software tester"),
            ContactModal("Olivia Johnson", "A UI developer"),
            ContactModal("Sophia Davis", "A UX designer"),
            ContactModal("Isabella Wilson", "A front-end developer"),
            ContactModal("Mia Wilson", "A back-end developer"),
            ContactModal("Ava Davis", "A mobile app developer"),
            ContactModal("Charlotte Smith", "A DevOps engineer"),
            ContactModal("Liam Davis", "A database administrator"),
            ContactModal("Olivia Smith", "A UI/UX designer"),
            ContactModal("Sophia Johnson", "A system administrator"),
            ContactModal("Isabella Smith", "A business analyst"),
            ContactModal("Mia Johnson", "A content writer"),
            ContactModal("Ava Wilson", "A QA tester"),
            ContactModal("Charlotte Davis", "A front-end developer"),
            ContactModal("Liam Wilson", "A back-end developer"),
            ContactModal("Olivia Taylor", "A mobile app developer"),
            ContactModal("Sophia Wilson", "A DevOps engineer"),
            ContactModal("Isabella Davis", "A network engineer"),
            ContactModal("Mia Smith", "A UX researcher"),
            ContactModal("Ava Smith", "A software architect"),
            ContactModal("Charlotte Wilson", "A game developer"),
            ContactModal("Liam Taylor", "A product owner"),
            ContactModal("Olivia Davis", "A systems analyst"),
            ContactModal("Sophia Smith", "A cloud engineer"),
            ContactModal("Isabella Johnson", "A UI designer"),
            ContactModal("Mia Davis", "A full-stack developer"),
            ContactModal("Ava Taylor", "A technical writer"),
            ContactModal("Charlotte Brown", "A cybersecurity analyst"),
            ContactModal("Liam Brown", "A data scientist"),
            ContactModal("Olivia Brown", "A solutions architect"),
            ContactModal("Sophia Brown", "A machine learning engineer"),
            ContactModal("Isabella Smith", "A game designer"),
            ContactModal("Mia Wilson", "A software tester"),
            ContactModal("Ava Brown", "A UI developer"),
            ContactModal("Charlotte Taylor", "A UX designer")
        )

        val adapter = ContactListAdapter(this, contactList)
        binding.ContactList.adapter = adapter


    }
}