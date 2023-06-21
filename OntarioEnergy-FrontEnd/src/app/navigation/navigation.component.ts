import { Component, OnInit } from '@angular/core';
import { OntarioRealtimeService } from '../ontario-realtime.service';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {
  

  #currentDate: Date = new Date();
  intervalId: any;

  get currentDate() {
    return this.#currentDate;
  }

  constructor(private _ontarioService: OntarioRealtimeService){}
  ngOnInit(): void {
    this.intervalId = setInterval(() => {
      this.#currentDate = new Date();
    }, 3000);
  }

  downloadCsv() {
    this._ontarioService.downloadCsv().subscribe({
      next: (file) => {
        var downloadFileURL = URL.createObjectURL(file);
        window.open(downloadFileURL);
      }
    })
  }
}
