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
  
 

}