package com.pts.findInternship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Partner")
public class Partner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "position",columnDefinition = "NVARCHAR(100)")
	private String position;
	@OneToOne
	@JoinColumn(name = "username")
	private User user;
	@OneToMany(mappedBy = "partner",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<DemandUni> demandUni = new HashSet<DemandUni>();
}
