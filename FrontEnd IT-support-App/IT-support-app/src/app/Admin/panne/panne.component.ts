import { Component } from '@angular/core';
import { Panne } from 'src/app/Model/Panne';
import { PanneService } from 'src/app/service/panne.service';

@Component({
  selector: 'app-panne',
  templateUrl: './panne.component.html',
  styleUrls: ['./panne.component.css']
})
export class PanneComponent {
  panne : Panne[] = [];
  constructor (private panneService : PanneService) {}

  ngOnInit() : void{
    this.getPanne();
  }
  getPanne() : void{
    this.panneService.getPannelist().subscribe( data => {
      this.panne = data ;
    })
  }
}
