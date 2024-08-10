import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EquipementComponent } from './Admin/equipement/equipement.component';
import { PanneComponent } from './Admin/panne/panne.component';

const routes: Routes = [
  {path : 'equipement', component : EquipementComponent},
  {path : 'panne', component : PanneComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
