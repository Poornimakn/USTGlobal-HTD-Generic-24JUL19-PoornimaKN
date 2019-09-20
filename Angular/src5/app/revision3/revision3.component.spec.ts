import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Revision3Component } from './revision3.component';

describe('Revision3Component', () => {
  let component: Revision3Component;
  let fixture: ComponentFixture<Revision3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Revision3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Revision3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
