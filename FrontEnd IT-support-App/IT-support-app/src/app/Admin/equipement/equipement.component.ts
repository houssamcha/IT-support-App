import { Component, OnInit } from '@angular/core';
import { Equipement } from 'src/app/Model/Equipements';
import { EquipementService } from 'src/app/service/equipement.service';

@Component({
  selector: 'app-equipement',
  templateUrl: './equipement.component.html',
  styleUrls: ['./equipement.component.css']
})
export class EquipementComponent implements OnInit {

  equipements : Equipement[] =  [];
  newEquipement: Equipement = new Equipement();
  constructor(private equipementService : EquipementService) {}
  

  ngOnInit(): void {
    this.getEquipements();
    console.log(this.newEquipement);
  }
  getEquipements() : void {
    this.equipementService.getEquipements().subscribe(data => {
      this.equipements = data ;
    })
  }
  
  onSubmit(): void {
    this.equipementService.ajouterEquipement(this.newEquipement).subscribe(
      (response) => {
        console.log('Équipement ajouté avec succès !', response);
        this.equipements.push(response);
        this.newEquipement = new Equipement();
      },
      (error) => {
        console.error('Erreur lors de l\'ajout de l\'équipement', error);
      }
    );
  }

}